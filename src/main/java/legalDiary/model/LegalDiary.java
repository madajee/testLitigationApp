package legalDiary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class LegalDiary {

	/*@Autowired
    Utilities utilties;*/

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Getter @Setter private String caseID;
	@Getter @Setter private String caseDesc;
	@Getter @Setter private String proceedingDate;
	@Getter @Setter private String proceedingNotes;
	@Getter @Setter private String createdBy;
	@Getter @Setter private String createdDate;
	@Getter @Setter private String updatedBy;
	@Getter @Setter private String updatedDate;

	public LegalDiary() {}

	public LegalDiary(String caseID, String caseDesc, String proceedingDate, String proceedingNotes,
		String createdBy, String createdDate, String updatedBy, String updatedDate) 
	{
		this.caseID = caseID;
		this.caseDesc = caseDesc;
		this.proceedingDate = proceedingDate;
		this.proceedingNotes = proceedingNotes;
		this.createdBy = createdBy;
		//this.createdDate = utilties.getTodayDate();
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}


}