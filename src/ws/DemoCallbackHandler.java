
/**
 * DemoCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.3  Built on : Aug 10, 2007 (04:45:47 LKT)
 */

    package ws;

    /**
     *  DemoCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class DemoCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public DemoCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public DemoCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for sum method
            * override this method for handling normal response from sum operation
            */
           public void receiveResultsum(
                    ws.DemoStub.SumResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sum operation
           */
            public void receiveErrorsum(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for hello method
            * override this method for handling normal response from hello operation
            */
           public void receiveResulthello(
                    ws.DemoStub.HelloResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from hello operation
           */
            public void receiveErrorhello(java.lang.Exception e) {
            }
                


    }
    