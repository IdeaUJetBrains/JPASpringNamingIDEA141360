package persistence.services;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import persistence.dao.IEntityDao;
import persistence.data.TESTTABLE;
import persistence.services.IMyEntityService;

//import javax.transaction.Transactional;


/**
 * Created by Olga Pavlova on 10/26/2015.
 */
@Transactional(readOnly = true)
public class MyEntityService implements IMyEntityService {
    private IEntityDao dao;
    public void setDao(IEntityDao dao) {
        this.dao = dao;
    }



    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void saveEntity(TESTTABLE entity)    {
        dao.save(entity);
    }

}
