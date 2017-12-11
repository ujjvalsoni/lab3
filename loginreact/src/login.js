import React from 'react';
import { Link } from 'react-router';
import * as  API from './api/moreapi';
import App from './App'
export class Login extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            username: '',
            password: '',
            isLoggedIn: false,
            user: []
        }
    }


    login() {
        let data = {
            username: this.state.username,
            password: this.state.password
        };

        API.doLogin(data)
            .then((output) => {
            if(output.length>0){
                var state_temp = this.state;
                state_temp.isLoggedIn = true;
                state_temp.user = output[0];
                this.setState(state_temp);
                console.log(this.state.user);
            }
            });
        }

    render() {
        let button = null;
        if (this.state.isLoggedIn === true) {
            button = <div>
                <App users={this.state.user}
                     isLoggedIn={this.state.isLoggedIn}
                />
            </div>;
        }
        else if(this.state.isLoggedIn === false){
            button =<div className="Container">

                User Name:<br/>
                <input type="text"
                       onChange={(event) => {
                           this.setState({
                               username: event.target.value
                           });
                       }}
                       name="username" required/>
                <br/><br/>
                Password:<br/>
                <input type="Password"
                       onChange={(event) => {
                           this.setState({
                               password: event.target.value
                           });
                       }}

                       name="password" required/>
                <br/><br/>
                <button onClick={()=>this.login()}>Submit</button>
                or: <Link to="signup">Sign Up</Link>

            </div>

        }

            return (
                <div>
                    {button}
                </div>
            );
    }
}
