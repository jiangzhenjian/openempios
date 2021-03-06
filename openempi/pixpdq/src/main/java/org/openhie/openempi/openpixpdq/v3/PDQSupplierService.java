/**
 *
 * Copyright (C) 2002-2012 "SYSNET International, Inc."
 * support@sysnetint.com [http://www.sysnetint.com]
 *
 * This file is part of OpenEMPI.
 *
 * OpenEMPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.openhie.openempi.openpixpdq.v3;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-21T11:21:40.031-05:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "PDQSupplier_Service", 
                  wsdlLocation = "/sysnet/projects/openempi-development/openempi/pixpdq/src/main/resources/wsdl/PIXPDQManager.wsdl",
                  targetNamespace = "urn:org:openhie:openpixpdq:services") 
public class PDQSupplierService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:org:openhie:openpixpdq:services", "PDQSupplier_Service");
    public final static QName PDQSupplierPortSoap12 = new QName("urn:org:openhie:openpixpdq:services", "PDQSupplier_Port_Soap12");
    static {
        URL url = PDQSupplierService.class.getResource("/sysnet/projects/openempi-development/openempi/pixpdq/src/main/resources/wsdl/PIXPDQManager.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(PDQSupplierService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "/sysnet/projects/openempi-development/openempi/pixpdq/src/main/resources/wsdl/PIXPDQManager.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public PDQSupplierService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PDQSupplierService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PDQSupplierService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns PDQSupplierPortType
     */
    @WebEndpoint(name = "PDQSupplier_Port_Soap12")
    public PDQSupplierPortType getPDQSupplierPortSoap12() {
        return super.getPort(PDQSupplierPortSoap12, PDQSupplierPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PDQSupplierPortType
     */
    @WebEndpoint(name = "PDQSupplier_Port_Soap12")
    public PDQSupplierPortType getPDQSupplierPortSoap12(WebServiceFeature... features) {
        return super.getPort(PDQSupplierPortSoap12, PDQSupplierPortType.class, features);
    }

}
