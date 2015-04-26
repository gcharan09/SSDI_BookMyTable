/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import Model.GuestUser;
import Model.UserMenu;
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
public class UserMenuDB {
    
    private static EntityManagerFactory emf;
    
    private List<GuestUser> users = new ArrayList<GuestUser>();
    
    public UserMenuDB() {
        
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
    
    public void addMenu(String randNumber,String menu, int quantity){
        UserMenu userMenu = new UserMenu();
        userMenu.setMenu(menu);
        userMenu.setQuantity(quantity);
        userMenu.setRandNumber(randNumber);
        
        addMenu(userMenu);
    }

    private void addMenu(UserMenu userMenu) {
        EntityManager em = UserMenuDB.emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(userMenu);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            em.close();
        }
        
    }
    
    public List<UserMenu> getMenuByNumber(String randNumber){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT u FROM UserMenu u " +
                "WHERE u.randNumber = :number";
        TypedQuery<UserMenu> q = em.createQuery(qString, UserMenu.class);
        q.setParameter("number", randNumber);
        List<UserMenu> resultList = new ArrayList<UserMenu>();
        try {
            resultList = q.getResultList();
        } catch (NoResultException ex) {
            return null;
        } finally {
            em.close();
        }
        
        return resultList;
    }
    
}
