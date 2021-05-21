class SigningUp { 
	constructor(fN,sN,fP,sP) {
		this.name=fN;
		this.surname=sN;
		this.password=fP;
		this.repassword=sP;
	}
}

function signup(event){
	event.preventDefault();
	
	FirstName = document.getElementById("FirstName").value;
	LastName = document.getElementById("LastName").value;
	FirstPass = document.getElementById("FirstPass").value;
	SecondPass = document.getElementById("SecondPass").value;
	
	var NewUser= new SigningUp(FirstName,LastName,FirstPass,SecondPass);
	let signupData = JSON.stringify({name: NewUser.name, surname: NewUser.surname, password: NewUser.password, repassword: NewUser.repassword});
	
	
	 $.ajax('/SpringSignUp', {
	        type: "POST",
	        data: signupData,
		    contentType: "application/json",
		    success: function (data, status, xhr) {
		        $('p').append('status: ' + status + ', data: ' + data);
		    },
		    error: function (jqXhr, textStatus, errorMessage) {
		            $('p').append('Error' + errorMessage);
		    }
		});
	
}



