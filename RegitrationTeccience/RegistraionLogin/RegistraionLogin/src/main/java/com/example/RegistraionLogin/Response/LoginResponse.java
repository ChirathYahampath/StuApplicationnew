package com.example.RegistraionLogin.Response;

public class LoginResponse {

    String massage;
    Boolean status;

    public LoginResponse(String massage, Boolean status) {
        this.massage = massage;
        this.status = status;
    }

    public LoginResponse() {
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "loginResponse{" +
                "massage='" + massage + '\'' +
                ", status=" + status +
                '}';
    }
}
