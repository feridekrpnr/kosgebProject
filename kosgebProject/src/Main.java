import entities.concretes.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Applicant applicant = new Applicant(1,"oracle","123abc","oracle@gmail.com",1,"");
        Credit credit = new Credit(1,"Erzurum Kredisi", LocalDate.parse("2022-10-10"), LocalDate.parse("2023-10-12"));
        Employee employee = new Employee(1,"feridekrpnr","123feride","feride@gmail.com",1,"Feride","Karpınar","Müdür");
        Applicant corporate = new Corporate(1,"Oracle","123","oracle@gmail.com",1,"123abc",1,"Oracle","123abc","Orta");
        Applicant entrepreneur = new Entrepreneur(1,"feridekrpnr","123abc","feride@gmail.com",1,"123abc",1,"Feride","Karpınar","31325154244");
        Application application = new Application(1,corporate,credit);
        Feature feature = new Feature(1,"Destek");
        CreditFeature creditFeature = new CreditFeature(1,feature,credit);
        Bank bank = new Bank(1,"Ziraat");
        BankUser bankUser = new BankUser(1,bank,entrepreneur);
        BlackList blackList = new BlackList(1,corporate);
        Authority authority = new Authority(1,"Kredi basvurusunu sorgulamak");
        UserAuthority userAuthority = new UserAuthority(1,authority,entrepreneur);

        System.out.println(credit.getCreditName());
        System.out.println(employee.getUserName());
        System.out.println(((Corporate)corporate).getCompanyName()); //unboxing
        System.out.println(((Entrepreneur)entrepreneur).getEntrepreneurId());
        System.out.println(application.getCredit().getCreditName());
        System.out.println(feature.getFeatureId());
        System.out.println(creditFeature.getCredit().getDueDate());
        System.out.println(bank.getBankName());
        System.out.println(bankUser.getUser().getUserName());
        System.out.println(blackList.getApplicant().getEmail());
        System.out.println(authority.getAuthorityName());
        System.out.println(userAuthority.getUserAuthorityId());





    }
}
