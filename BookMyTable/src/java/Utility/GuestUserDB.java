/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.io.Serializable;
import Model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.spi.PersistenceUnitTransactionType;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_DRIVER;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_PASSWORD;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_URL;
import static org.eclipse.persistence.config.EntityManagerProperties.JDBC_USER;
import static org.eclipse.persistence.config.PersistenceUnitProperties.TARGET_SERVER;
import static org.eclipse.persistence.config.PersistenceUnitProperties.TRANSACTION_TYPE;
import org.eclipse.persistence.config.TargetServer;

/**
 *
 * @author SRINEAL
 */
public class GuestUserDB {
    private static EntityManagerFactory emf;
    
    private List<GuestUser> users = new ArrayList<GuestUser>();
    
    public GuestUserDB() {
        
        Map props = new HashMap();
        props.put(TRANSACTION_TYPE,
                PersistenceUnitTransactionType.RESOURCE_LOCAL.name());
        props.put(JDBC_DRIVER, "com.mysql.jdbc.Driver");
        props.put(JDBC_URL,
                "jdbc:mysql://localhost:3306/opentable?zeroDateTimeBehavior=convertToNull");
        props.put(JDBC_USER, "root");
        props.put(JDBC_PASSWORD, "root");
        props.put(TARGET_SERVER, TargetServer.None);
        
        emf = Persistence.createEntityManagerFactory("persistence", props);
    }
    
    public void addUser(String name, String email, String date, String time, String randNumber, int attendees){
        GuestUser user = new GuestUser();
        user.setName(name);
        user.setEmail(email);
        user.setRandNumber(randNumber);
        user.setAtttendees(attendees);
        user.setTime(time);
        user.setDate(date);
        
        addUser(user);
    }
    
    private void addUser(GuestUser user) {
       
        EntityManager em = GuestUserDB.emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(user);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        
    }
    
    public List<GuestUser> getAllUsers(){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT u FROM GuestUser u ";
        TypedQuery<GuestUser> q = em.createQuery(qString, GuestUser.class);
        List<GuestUser> resultList;
        try {
            resultList = q.getResultList();
        } catch (Exception ex) {
            return null;
        } finally {
            em.close();
        }
        return resultList;
    }
    
    public GuestUser getUser(int userID){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        return em.find(GuestUser.class, userID);
    }
    
    public GuestUser getUserByNumber(String randNumber){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT u FROM GuestUser u " +
                "WHERE u.randNumber = :number";
        TypedQuery<GuestUser> q = em.createQuery(qString, GuestUser.class);
        q.setParameter("number", randNumber);
        GuestUser result = null;
        try {
            result = q.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            em.close();
        }
        
        return (GuestUser)result;
    }
    
}
