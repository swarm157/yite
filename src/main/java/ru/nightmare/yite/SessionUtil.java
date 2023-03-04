package ru.nightmare.yite;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class SessionUtil {
    Session session;
    Transaction transaction;

    public Session openSession() {
        return session;
    }
    public Transaction getTransaction() {
        return transaction;
    }
    public void closeSession() {
        session.close();
    }
    public Session openTransactionSession() {
        session = openSession();
        transaction = session.beginTransaction();
        return session;
    }
    public void closeTransactionSession() {
        transaction.commit();
        closeSession();
    }
}
