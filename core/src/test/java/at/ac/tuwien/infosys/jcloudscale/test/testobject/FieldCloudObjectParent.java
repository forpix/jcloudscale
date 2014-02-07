/*
   Copyright 2013 Philipp Leitner

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package at.ac.tuwien.infosys.jcloudscale.test.testobject;

import at.ac.tuwien.infosys.jcloudscale.annotations.CloudObjectParent;

@CloudObjectParent 
public class FieldCloudObjectParent {
	
	protected String protectedParentField = "protected_parent";
	public String publicParentField = "public_parent";
	
	public static void setProtectedField(FieldCloudObject obj, String value) {
		obj.protectedParentField = value;
	}
	
	public String getProtectedParentField() {
		return protectedParentField;
	}
	public void setProtectedParentField(String protectedParentField) {
		this.protectedParentField = protectedParentField;
	}
	public String getPublicParentField() {
		return publicParentField;
	}
	public void setPublicParentField(String publicParentField) {
		this.publicParentField = publicParentField;
	}
	
}