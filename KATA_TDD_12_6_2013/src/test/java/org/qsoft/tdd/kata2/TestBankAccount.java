package org.qsoft.tdd.kata2;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 6/12/13
 * Time: 2:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestBankAccount {

    BankAccountDao mockAccountDao = mock(BankAccountDao.class);
    BankAccountService bankAccountService = new BankAccountService();

    @Before
    public void setUp() {
        reset(mockAccountDao);
        bankAccountService.setBankAccountDao(mockAccountDao);
    }

    @Test
    public void openNewAccount() {
        bankAccountService.openBankAccount("1234567890");

        ArgumentCaptor<BankAccount> savedAccountRecords = ArgumentCaptor.forClass(BankAccount.class);
        verify(mockAccountDao).save(savedAccountRecords.capture());

        assertEquals(savedAccountRecords.getValue().getBalance(), 0.0, 0.01);
        assertEquals(savedAccountRecords.getValue().getAccountNumber(),"1234567890");
    }
}
