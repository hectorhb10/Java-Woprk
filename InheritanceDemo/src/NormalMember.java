public class NormalMember extends Member {
    public NormalMember(){
        System.out.println("Child Constructor with no parameter");
    }

    public NormalMember(String pName, int pMemberID, int pMemberSince){
        super(pName,pMemberID,pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
    }
}

