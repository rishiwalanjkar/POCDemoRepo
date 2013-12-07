package db.table.details;

public enum VoterList {
	voter_list("voter_list", "voter_id", "voter_sr_no", "voter_name",
			"voter_fname", "voter_mname", "voter_lname", "address", "house_no",
			"cast_id", "sex", "age", "voter_name_eng", "voter_parent_name",
			"vote_list_id", "area_id", "village_id", "profession_id",
			"contact_no", "booth_id", "voting_centre_id", "is_active");

	public String TableName, VoterId, VoterSrNo, VoterName, VoterFname,
			VoterMname, VoterLname, Address, HouseNo, CastId, Sex, Age,
			VoterNameEng, VoterParentName, VoteListId, AreaId, VillageId,
			ProfessionId, ContactNo, BoothId, VotingCentreId, IsActive;

	private VoterList(String TableName, String VoterId, String VoterSrNo,
			String VoterName, String VoterFname, String VoterMname,
			String VoterLname, String Address, String HouseNo, String CastId,
			String Sex, String Age, String VoterNameEng,
			String VoterParentName, String VoteListId, String AreaId,
			String VillageId, String ProfessionId, String ContactNo,
			String BoothId, String VotingCentreId, String IsActive) {
		this.TableName = TableName;
		this.VoterId = VoterId;
		this.VoterSrNo = VoterSrNo;
		this.VoterName = VoterName;
		this.VoterFname = VoterFname;
		this.VoterMname = VoterMname;
		this.VoterLname = VoterLname;
		this.Address = Address;
		this.HouseNo = HouseNo;
		this.CastId = CastId;
		this.Sex = Sex;
		this.Age = Age;
		this.VoterNameEng = VoterNameEng;
		this.VoterParentName = VoterParentName;
		this.VoteListId = VoteListId;
		this.AreaId = AreaId;
		this.VillageId = VillageId;
		this.ProfessionId = ProfessionId;
		this.ContactNo = ContactNo;
		this.BoothId = BoothId;
		this.VotingCentreId = VotingCentreId;
		this.IsActive = IsActive;
	}

	public int getPosition(String choice) {
		if (choice.equals(this.VoterId))
			return 0;
		else if (choice.equals(this.VoterSrNo))
			return 1;
		else if (choice.equals(this.VoterName))
			return 2;
		else if (choice.equals(this.VoterFname))
			return 3;
		else if (choice.equals(this.VoterMname))
			return 4;
		else if (choice.equals(this.VoterLname))
			return 5;
		else if (choice.equals(this.Address))
			return 6;
		else if (choice.equals(this.HouseNo))
			return 7;
		else if (choice.equals(this.CastId))
			return 8;
		else if (choice.equals(this.Sex))
			return 9;
		else if (choice.equals(this.Age))
			return 10;
		else if (choice.equals(this.VoterNameEng))
			return 11;
		else if (choice.equals(this.VoterParentName))
			return 12;
		else if (choice.equals(this.VoteListId))
			return 13;
		else if (choice.equals(this.AreaId))
			return 14;
		else if (choice.equals(this.VillageId))
			return 15;
		else if (choice.equals(this.ProfessionId))
			return 16;
		else if (choice.equals(this.ContactNo))
			return 17;
		else if (choice.equals(this.BoothId))
			return 18;
		else if (choice.equals(this.VotingCentreId))
			return 19;
		else if (choice.equals(this.IsActive))
			return 20;

		return -1;
	}
}