package ao.morgado.feature.employee.dto;

import java.time.LocalDate;

public record EmployeeResponse(
        String uuid,
        EmployeeBiDetails employeeBiDetails,
        EmployeeDepartment employeeDepartment
) {

    public record EmployeeBiDetails(String fullName, String biNumber, LocalDate birthDate) {}

    public record EmployeeDepartment(String typeWritten, String name) {}
}