import React, { Component } from 'react';
import BankService from '../services/BankService';

class ListBankComponent extends Component {
    constructor(props){
        super(props)

        this.state = {
                banks: []
            
        }
    }
    

    componentDidMount(){
        BankService.getBanks().then((res) =>{
            
           this.setState({banks: res.data});
            console.log(res);
        });
    }

    render() {
        return (
            <div>
                <h3 className="text-center">Bank List</h3>
                <div className="row">
                    <table className="table table-striped ">
                        <thead>
                            <tr>
                                <th>Bank Id</th>
                                <th>Bank Name</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.banks.map(
                                    bank =>
                                    <tr >
                                        <td> {bank.id}</td>
                                        <td>{bank.firstName}</td>

                                    </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
}

export default ListBankComponent;