import React from 'react';
import {getlogin, getuser} from './api/api';
import {Notlogin} from "./notlogin";
import {Navbar1} from "./navbar";

export class App extends React.Component {


    constructor() {
        super();
        this.state = {
            user: [],
            login: false
        };
    }



    componentDidMount() {
        var state_temp = this.state;
        state_temp.login = this.props.isLoggedIn;
        state_temp.user = this.props.users;
        this.setState(state_temp);
        console.log(this.state.user);
    }

    render() {
        let button = null;
        if(this.state.login === true) {
            button = <div>
                <Navbar1/>
                <h2>Welcome, {this.state.user.name}!!</h2>
                <h3>
                    Your Information is as follows!
                </h3>

                <ul>
                    <li>Your First Name is: {this.state.user.name}</li>
                    <li>Your Last Name is: {this.state.user.lastname}</li>
                    <li>Your Email is: {this.state.user.email}</li>
                    <li>Your Age is: {this.state.user.age} year(s)</li>
                    <li>Your Gender is: {this.state.user.gender}</li>
                    <li>Your Work is: Software Engg!</li>
                    <li>Your Music is: Rock</li>
                    <li>Your Education was at is: San Jose State!</li>
                </ul>
            </div>;
        }

        else{
            <Notlogin/>
        }
        return (

            <div>
                {button}
            </div>

        );
    }
}

export default App;

