import React from 'react';
import EmployeeCard from './EmployeeCard';

function EmployeesList() {
  const employees = [
    { id: 1, name: 'Anjali Mehta', role: 'Frontend Developer' },
    { id: 2, name: 'Ravi Kumar', role: 'Backend Developer' },
    { id: 3, name: 'Priya Nair', role: 'QA Engineer' },
  ];

  return (
    <div>
      <h2>Employees</h2>
      {employees.map((emp) => (
        <EmployeeCard key={emp.id} name={emp.name} role={emp.role} />
      ))}
    </div>
  );
}

export default EmployeesList;