import React, { Component } from 'react';

class CourseDetails extends Component {
  constructor(props) {
    super(props);
    this.state = {
      courses: [
        { id: 1, name: 'React Fundamentals', seatsLeft: 5 },
        { id: 2, name: 'Advanced JavaScript', seatsLeft: 0 },
        { id: 3, name: 'Node.js Basics', seatsLeft: 12 },
      ],
      hideComponent: false,
    };
  }

  render() {
    // Preventing the component from rendering entirely
    if (this.state.hideComponent) {
      return null;
    }

    return (
      <div>
        <h2>Course Details</h2>
        <ul>
          {this.state.courses.map((course) => (
            <li key={course.id}>
              {course.name} —{' '}
              {/* Conditional rendering using ternary operator */}
              {course.seatsLeft > 0 ? (
                <span style={{ color: 'green' }}>{course.seatsLeft} seats left</span>
              ) : (
                <span style={{ color: 'red' }}>Sold out</span>
              )}
            </li>
          ))}
        </ul>
      </div>
    );
  }
}

export default CourseDetails;