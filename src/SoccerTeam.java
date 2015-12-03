
public class SoccerTeam {
	 private TeamPerson headCoach;
	   private TeamPerson assistantCoach;
	   // Players omitted for brevity
	   
	   public void setHeadCoach(TeamPerson teamPerson) {
	      headCoach = teamPerson;
	      return;
	   }
	   
	   public void setAssistantCoach(TeamPerson teamPerson) {
	      assistantCoach = teamPerson;
	      return;
	   }
	   
	   public TeamPerson getHeadCoach() {
	      return headCoach;
	   }
	   
	   public TeamPerson getAssistantCoach() {
	      return assistantCoach;
	   }
	   
	   public void print() {
	      System.out.println("HEAD COACH: ");
	      headCoach.print();
	      System.out.println();
	      
	      System.out.println("ASSISTANT COACH: ");
	      assistantCoach.print();
	      System.out.println();
	      return;
	   }
}
