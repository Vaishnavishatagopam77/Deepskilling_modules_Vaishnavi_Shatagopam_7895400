import React from 'react';

function App() {
  // JSX element for heading
  const heading = <h1>Office Space Rental</h1>;

  // Object with Name, Rent, Address
  const office = {
    name: 'Skyline Business Center',
    rent: 75000,
    address: 'MG Road, Bangalore',
  };

  // List of office objects to loop through
  const officeList = [
    { name: 'Skyline Business Center', rent: 75000, address: 'MG Road, Bangalore' },
    { name: 'Tech Park Suites', rent: 45000, address: 'Hitech City, Hyderabad' },
    { name: 'Corporate Towers', rent: 90000, address: 'BKC, Mumbai' },
    { name: 'Green Valley Offices', rent: 38000, address: 'Whitefield, Bangalore' },
  ];

  return (
    <div>
      {heading}

      {/* Attribute used to display an image */}
      <img
        src="C:\Users\SYASH\Downloads\Deepskilling\react\Exercise10\officespacerentalapp\src\office-workspace_thumbnail.jpg"
        alt="Office Space"
        width="300"
      />

      <h2>Featured Office</h2>
      <p>Name: {office.name}</p>
      <p>Address: {office.address}</p>
      <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
        Rent: {office.rent}
      </p>

      <h2>All Available Offices</h2>
      {officeList.map((item, index) => (
        <div key={index} style={{ marginBottom: '10px' }}>
          <p>Name: {item.name}</p>
          <p>Address: {item.address}</p>
          <p style={{ color: item.rent < 60000 ? 'red' : 'green' }}>
            Rent: {item.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;