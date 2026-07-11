package ao.morgado.feature.employee.datasource;

import ao.morgado.feature.employee.dto.EmployeeApiRequest;

public interface EmployeeProxy {

    EmployeeApiRequest getEmployeeDetails(String uuid, int cause);
}
