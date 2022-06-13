/**
 * @author : ALE_IS_TER
 * Project Name: Hibernate_xml_configur
 * Date        : 6/12/2022
 * Time        : 9:42 PM
 * @Since : 0.1.0
 */

package lk.ijse.hibernate.util;

public class FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;

    private FactoryConfiguration(){}

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration == null) ? factoryConfiguration=new FactoryConfiguration()
                : factoryConfiguration;
    }
}
