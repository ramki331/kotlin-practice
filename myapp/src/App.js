import React, { Component } from 'react';
import './App.css';
import Person from './Person/Person'

class App extends Component {
  state = {
    person: [
      {name: "RamaKrishna", age: 32},
      {name: "Srikanth", age: 29},
      {name: "Varun Sai", age: 3}
    ],
    showPersons: false
  }

  switchNameHandler = (newName, age) => {
    console.log("button clicked...")
    this.setState({
      person: [
        {name: newName, age: age},
        {name: "Srikanth N", age: 28},
        {name: "Varun Sai N", age: 3}
      ]
    })
  }

  changedNameHandler = (event) => {
    console.log("in change handler");

    this.setState({
      person: [
        {name: "RamaKrishna", age: 32},
        {name: event.target.value, age: 29},
        {name: "Varun Sai", age: 3}
      ]
    })
  }

  togglePersonHandler = () => {
    this.setState({
      showPersons : !this.state.showPersons
    })
  }

  render() {

    const styles = {
      backgroundColor: 'white',
      border: '1px solid blue',
      padding: '8px',
      cursor: 'pointer'
    }

    let persons = null;

    if(this.state.showPersons) {
      persons = (
        <div>
        <Person 
        name={this.state.person[0].name} e
        age={this.state.person[0].age}
        onclick = {this.switchNameHandler.bind(this, "RK Nadipineni", 21)}/>

        <Person 
        name={this.state.person[1].name} 
        age={this.state.person[1].age}
        onclick = {this.switchNameHandler.bind(this, "Kanthu", 23)}
        changed = {this.changedNameHandler}>
        Test Test Test
        </Person>

        <Person 
        name={this.state.person[2].name} 
        age={this.state.person[2].age}
        onclick = {this.switchNameHandler.bind(this, "Varun Nadipineni", 2)}/> 
      </div> 
      );
    }

    return (
      // React.createElement('div', {className: 'App'}, React.createElement(
      //   'h1', null, 'Hi, I am a react App'
      // ))
      <div className="App">

        <h1>Hi, I am a react App</h1>
        <h4> This is really working</h4>

        <button style={styles} onClick={this.togglePersonHandler}>Toggle Persons</button>
        {persons}
      </div>
    );
  }
}

export default App;
