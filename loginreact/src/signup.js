import React from 'react';
import * as  API from './api/moreapi';

export class Signup extends React.Component{


    constructor(props){
        super(props);
        this.state = {
            email: '',
            password: '',
            name: '',
            lastname: '',
            age: '',
            gender: '',
            isLoggedIn: false,
            user: []
        }
    }


    signup() {
        let data = {
            email: this.state.email,
            password: this.state.password,
            name: this.state.name,
            lastname: this.state.lastname,
            age: this.state.age,
            gender: this.state.gender,

        };

        API.dosignup(data)
            .then((output) => {
                console.log(output);

            });
    }






    render() {
        return (
            <div>

                    Email:<br/>
                    <input type="email"
                           onChange={(event) => {
                               this.setState({
                                   email: event.target.value
                               });
                           }}

                           name="email" required/>
                    <br/><br/>
                    PassWord:<br/>
                    <input type="PassWord"
                           onChange={(event) => {
                               this.setState({
                                   password: event.target.value
                               });
                           }}

                           name="password" required/>
                    <br/><br/>
                    First name:<br/>
                    <input type="text"
                           onChange={(event) => {
                               this.setState({
                                   name: event.target.value
                               });
                           }}

                           name="fname" required/>
                    <br/><br/>
                    Last name:<br/>
                    <input type="text"
                           onChange={(event) => {
                               this.setState({
                                   lastname: event.target.value
                               });
                           }}

                           name="lname" required/>
                    <br/><br/>
                    Age:<br/>
                    <input type="number"
                           onChange={(event) => {
                               this.setState({
                                   age: event.target.value
                               });
                           }}

                           name="age" required/>
                    <br/><br/>
                    Gender
                    <br/>
                    <input class="w3-radio" type="radio" name="gender"
                           onClick={(event) => {
                               this.setState({
                                   gender: event.target.value
                               });
                           }}

                           value="Male" />Male
                    <br/>
                    <input class="w3-radio" type="radio" name="gender"
                           onClick={(event) => {
                               this.setState({
                                   gender: event.target.value
                               });
                           }}

                           value="Female" />Female
                    <br/><br/>
                    <button onClick={()=>this.signup()}>Submit</button>
            </div>

        );
    }
}
