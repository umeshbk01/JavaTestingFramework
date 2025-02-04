package TestingFrameWork;

import TestingFrameWork.Constants.AssertStatus;

public class AssertionResult {
    AssertStatus status;
    String message;
    public AssertionResult(AssertStatus status, String message){
        this.status = status;
        this.message = message;
    }
    //Geeters Setters
    public AssertStatus getStatus() {
        return status;
    }

    public void setStatus(AssertStatus status) {
        this.status =status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
