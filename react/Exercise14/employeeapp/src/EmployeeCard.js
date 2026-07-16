import React, { useContext } from 'react';
import ThemeContext from './ThemeContext';

function EmployeeCard({ name, role }) {
  const theme = useContext(ThemeContext);

  return (
    <div className={theme === 'light' ? 'card-light' : 'card-dark'}>
      <h4>{name}</h4>
      <p>{role}</p>
      <button className={theme === 'light' ? 'btn-light' : 'btn-dark'}>
        View Profile
      </button>
    </div>
  );
}

export default EmployeeCard;