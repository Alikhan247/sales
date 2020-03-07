package kz.iitu.alikhan.sale.Dao;

import kz.iitu.alikhan.sale.Employee.Salaried;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SalariedMapper implements RowMapper<Salaried> {
    @Override
    public Salaried mapRow(ResultSet resultSet, int i) throws SQLException {
        Salaried employee = new Salaried();
        employee.setId(resultSet.getInt(1));
        employee.setName(resultSet.getString(2));
        employee.setSalary(resultSet.getInt(3));
        employee.setHourseWorked(resultSet.getInt(4));

        return employee;
    }
}
