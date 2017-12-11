import React from 'react';
import {getlogin, getlistfiles} from './api/api';
import ReactDOMServer from 'react-dom/server';
import {Notlogin} from "./notlogin";
import {Navbar1} from "./navbar";
import {Star} from "./star";

export class Listfiles extends React.Component {
    constructor() {
        super();
        this.state = {
            list1: [],
            list : [],
            count: 1
        };
    }

    listdir() {
        /*
        getlistdir().then((list1) => {
            this.setState({list1});
        });
        */

        getlistfiles().then((list) => {
            this.setState({list});
        });

        /*
        getlogin().then((count) => {
            this.setState({count:count.count});
        });
        */

    }

    componentDidMount() {
        this.listdir();

    }

    render() {
        return (
            <div>
                <div>

                    <h2>List of Files</h2>
                    <div classname="well">
                        <ul classname="list-group">
                            {this.state.list.map((item,index) =>
                                <li key={index} className={"list-group-item list-group-item-info"}>
                                    {item}
                                </li>
                            )}
                        </ul>
                    </div>
                </div>;}
            </div>
        );
    }
}
