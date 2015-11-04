package persistence.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import persistence.data.TESTTABLE;
import persistence.data.Testtable1;


/**
 * Created by Olga Pavlova on 10/26/2015.
 */
public class EntityDao extends HibernateDaoSupport implements IEntityDao {
    private IEntityDao dao;

    @Override

    public void save(TESTTABLE entity) {
        getHibernateTemplate().save(entity);
        System.out.print(entity.getLastname());
    }



   /* @Override
    public void save1(TESTTABLE entity) {
        //getHibernateTemplate().save(entity);
        System.out.print(entity.getLastname());
    }*/

   /* @Override
    public void save2(Testtable1 entity)    {
        //getHibernateTemplate().save(entity);
        System.out.print( getSessionFactory().getCurrentSession().getEntityName(entity) +",\n" +  entity.getLastname() );
    }*/
}
