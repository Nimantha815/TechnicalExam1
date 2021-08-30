import React, { Component } from 'react';
import CustomerService from '../services/CustomerService';

class ListOfCustomer extends Component {
    constructor(props){
        super(props)

        this.state = {
                customers: []
            
        }
    }
    

    componentDidMount(){
        CustomerService.getCustomers().then((res) =>{
            
            this.setState({customers: res.data});
            
        });
    }

    render() {
        return (
            <div>
                <h3 className="text-center">Customer List</h3>
                <div className="row">
                    <table className="table table-striped ">
                        <thead>
                            <tr>
                                
                                <th>FirstName</th>
                                <th>Lastname</th>
                                <th>DOB</th>
                                <th>Phone</th>
                                <th>Nic</th>
                                <th>Gender</th>
                                <th>Address</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.customers.map(
                                    customer =>
                                    <tr key={customer.id}>
                                        
                                        <td>{customer.firstName}</td>
                                        <td>{customer.lasttName}</td>
                                        <td>{customer.dob}</td>
                                        <td>{customer.phone}</td>
                                        <td>{customer.nic}</td>
                                        <td>{customer.gender}</td>
                                        <td>{customer.address}</td>

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

export default ListOfCustomer;