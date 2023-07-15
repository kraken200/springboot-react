import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom/cjs/react-router-dom.min'
import EmployeeService from '../services/EmployeeService'
const ListEmployeeComponent = () => {
  const [employees, setEmployees] = useState([])
  useEffect(() => {
    getAllEmployees()
  }, [])

  const getAllEmployees = () => {
    EmployeeService.getAllEmployees()
      .then((response) => {
        setEmployees(response.data)
      })
      .catch((error) => {
        console.log(error)
      })
  }
  const deleteEmployee = (employeeId) => {
    EmployeeService.deleteEmployee(employeeId)
      .then((response) => {
        getAllEmployees()
      })
      .catch((error) => {
        console.log(error)
      })
  }
  return (
    <div className="container">
      <h2 className="text-center"> List employees</h2>
      <Link to="/add-employee" className="btn btn-primary mb-2">
        {' '}
        Add Employee
      </Link>
      <table className="table table-bordered table-striped">
        <thead>
          <th> Employee Id</th>
          <th> Employee First name</th>
          <th> Employee Last Name</th>
          <th> Employee Email Id</th>
          <th> Actions</th>
        </thead>
        <tbody>
          {employees.map((employee) => {
            return (
              <tr key={employee.id}>
                <td>{employee.id}</td>
                <td>{employee.firstName}</td>
                <td>{employee.lastName}</td>
                <td>{employee.emailId}</td>
                <td>
                  {' '}
                  <Link
                    className="btn btn-info"
                    to={`/edit-employees/${employee.id}`}
                  >
                    Update
                  </Link>
                  <button
                    className="btn btn-danger"
                    onClick={() => deleteEmployee(employee.id)}
                    style={{ margin: '5px' }}
                  >
                    Delete
                  </button>
                </td>
              </tr>
            )
          })}
        </tbody>
      </table>
    </div>
  )
}
export default ListEmployeeComponent
