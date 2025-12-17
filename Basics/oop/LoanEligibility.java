package Basics.oop;

public class LoanEligibility {
    static void main() {
        String loanApplicantName = IO.readln("Enter Name Of Applicant : ");
        int civilScore = Integer.parseInt(IO.readln("Enter Civil Score : "));
        LoanApplicant loanApplicant = new LoanApplicant(loanApplicantName, civilScore);
        OfferedLoan offeredLoan = LoanType.getLoanType(loanApplicant);
        IO.print(offeredLoan);
    }
}


// BLC
class LoanApplicant{
    private String applicantName;
    private int civilScore;

    public LoanApplicant(String applicantName, int civilScore){
        this.applicantName = applicantName;
        this.civilScore = civilScore;
    }

    public String getApplicantName() {
        return this.applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getCivilScore() {
        return this.civilScore;
    }

    public void setCivilScore(int civilScore) {
        this.civilScore = civilScore;
    }

    public String toString(){
        return this.getApplicantName();
    }
}

// BLC1
class OfferedLoan{
    private LoanApplicant loanApplicant;
    private String loanType;

    public OfferedLoan(LoanApplicant loanApplicant, String loanType) {
        this.loanApplicant = loanApplicant;
        this.loanType = loanType;
    }

    public LoanApplicant getLoanApplicant() {
        return loanApplicant;
    }

    public void setLoanApplicant(LoanApplicant loanApplicant) {
        this.loanApplicant = loanApplicant;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String toString(){
        return "[The Loan Applicant Name "+this.loanApplicant.getApplicantName()+" Loan Type '"+this.loanType+"]";
    }
}

// BLC 2
class LoanType{
    public static OfferedLoan getLoanType(LoanApplicant loanApplicant){
        int cibil=loanApplicant.getCivilScore();

        if(cibil>750)
        {
            return new OfferedLoan(loanApplicant, "Home Loan");
        }
        else if(cibil>700)
        {
            return new OfferedLoan(loanApplicant, "Car Loan");
        }
        else if(cibil>650)
        {
            return new OfferedLoan(loanApplicant, "Personal Loan");
        }
        else if(cibil>600)
        {
            return new OfferedLoan(loanApplicant, "Education Loan");
        }
        else
        {
            return new OfferedLoan(loanApplicant, "Not Eligible");
        }
    }
}
