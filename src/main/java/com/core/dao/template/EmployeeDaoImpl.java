package com.core.dao.template;

//import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * TODO: use a repository interface to implement below functionality
 *
 * @author Srinath.Rayabarapu
 */
public class EmployeeDaoImpl extends JdbcDaoSupport {

    // TODO - fix this
    public int getTotalNumberInstitutions() {
//        return new SimpleJdbcTemplate(getDataSource()).queryForInt("select count(0) from institute_mst");
        return 0;
    }

}