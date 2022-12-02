import React from "react";
import { useNavigate } from "react-router-dom";

const Employee = ({ employe, deleteEmployee }) => {
  const navigate = useNavigate();

  const editEmployee = (e, id) => {
    e.preventDefault();

    navigate(`/editemployee/${id}`);
  };

  return (
    <tr key={employe.id}>
      <td className=" text-left px-6 py-4 whitespace-nowrap">
        <div className="text-sm text-gray-500">{employe.firstName}</div>
      </td>
      <td className=" text-left px-6 py-4 whitespace-nowrap">
        <div className="text-sm text-gray-500">{employe.lastName}</div>
      </td>
      <td className=" text-left px-6 py-4 whitespace-nowrap">
        <div className="text-sm text-gray-500">{employe.emailId}</div>
      </td>
      <td className=" text-right px-6 py-4 whitespace-nowrap font-medium text-sm">
        <a
          onClick={(e, id) => editEmployee(e, employe.id)}
          className="text-indigo-600 hover:text-indigo-800 px-4 cursor-pointer "
        >
          Edit
        </a>
        <a
          onClick={(e, id) => deleteEmployee(e, employe.id)}
          className="text-red-600 hover:text-red-800 px-4 cursor-pointer"
        >
          Delete
        </a>
      </td>
    </tr>
  );
};

export default Employee;
