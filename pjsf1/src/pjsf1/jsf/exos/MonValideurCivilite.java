package pjsf1.jsf.exos;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("pjsf1.jsf.exos.MonValideurCivilite")
public class MonValideurCivilite implements Validator {
	
	@Override
	public void validate(FacesContext facesContext, UIComponent component, Object value) throws ValidatorException {
		      
		
		String inputData = value.toString();
		
		if(! (inputData.equals("Mr") || inputData.equals("Mme") || inputData.equals("Mlle"))){
				
				FacesMessage msg = new FacesMessage("Erreur de civilite (Mr,Mme,Mlle)");
				
				msg.setSeverity(FacesMessage.SEVERITY_ERROR);
				
				throw new ValidatorException(msg);
		
		   }

		}

	}
