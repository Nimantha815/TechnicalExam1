import axios from "axios";

const BANK_API_BASE_URL = "localhost:8080/api/v1/banks"
class BankService{
    getBanks(){
        return axios.get(BANK_API_BASE_URL);
    }
}

export default new BankService()