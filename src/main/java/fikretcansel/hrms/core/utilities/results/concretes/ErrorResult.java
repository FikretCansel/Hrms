package fikretcansel.hrms.core.utilities.results.concretes;


public class ErrorResult extends Result{

	public ErrorResult(){
		super(false);
	}
	public ErrorResult(String message) {
		super(false,message);
	}

}
