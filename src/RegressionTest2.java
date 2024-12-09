import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        java.lang.String str23 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        java.lang.String str18 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str16 = serviceRequest5.getStatus();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.lang.String str18 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str17 = serviceRequest5.getStatus();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        java.lang.String str20 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str20 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        java.lang.String str12 = serviceRequest5.getStatus();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.lang.String str19 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.lang.String str20 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.String str15 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str22 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        java.lang.String str20 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str17 = serviceRequest5.getStatus();
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        java.lang.String str22 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate23 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        java.lang.String str20 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str11 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        java.lang.String str19 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str24 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("");
        java.lang.String str16 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str19 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str18 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.lang.String str11 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str23 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        java.time.LocalDate localDate23 = null;
        serviceRequest5.setRequestDate(localDate23);
        java.time.LocalDate localDate25 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getStatus();
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getStatus();
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.lang.String str19 = serviceRequest5.getStatus();
        java.lang.String str20 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass22 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.lang.String str17 = serviceRequest5.getStatus();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        java.lang.String str20 = serviceRequest5.getContactNumber();
        java.lang.String str21 = serviceRequest5.getStatus();
        java.lang.String str22 = serviceRequest5.getContactNumber();
        java.lang.String str23 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("");
        java.lang.String str16 = serviceRequest5.getStatus();
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.lang.String str19 = serviceRequest5.getContactNumber();
        java.lang.String str20 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str12 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setStatus("");
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str12 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str18 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate23 = null;
        serviceRequest5.setRequestDate(localDate23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate25 = null;
        serviceRequest5.setRequestDate(localDate25);
        java.lang.Class<?> wildcardClass27 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        java.lang.String str14 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        java.lang.String str22 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.String str25 = serviceRequest5.getCustomerName();
        java.lang.String str26 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.lang.String str20 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str22 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str19 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.lang.String str20 = serviceRequest5.getStatus();
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        java.time.LocalDate localDate23 = null;
        serviceRequest5.setRequestDate(localDate23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass9 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate7 = serviceRequest5.getRequestDate();
        java.lang.String str8 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.String str12 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.time.LocalDate localDate9 = null;
        serviceRequest5.setRequestDate(localDate9);
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str18 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        java.lang.String str20 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        java.lang.String str21 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.lang.String str21 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.lang.String str18 = serviceRequest5.getContactNumber();
        java.lang.String str19 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        java.lang.String str20 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        serviceRequest5.setStatus("");
        java.lang.String str23 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str21 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass22 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setCustomerName("");
        java.lang.String str16 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str18 = serviceRequest5.getContactNumber();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str17 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = localDate15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str16 = serviceRequest5.getStatus();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str16 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        serviceRequest5.setIssueDescription("");
        java.lang.String str21 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str17 = serviceRequest5.getStatus();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        serviceRequest5.setIssueDescription("");
        java.lang.String str18 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        java.lang.String str18 = serviceRequest5.getContactNumber();
        java.lang.String str19 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getContactNumber();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str12 = serviceRequest5.getStatus();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setStatus("");
        java.lang.String str19 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate9 = null;
        serviceRequest5.setRequestDate(localDate9);
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        java.lang.String str20 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate23 = serviceRequest5.getRequestDate();
        java.lang.String str24 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.lang.String str18 = serviceRequest5.getStatus();
        java.lang.String str19 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str9 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        java.lang.String str20 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        java.lang.String str12 = serviceRequest5.getStatus();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getStatus();
        java.lang.String str20 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(localDate21);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.lang.String str18 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass10 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str12 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        java.lang.String str16 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.lang.String str20 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass23 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("");
        java.lang.String str16 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = localDate16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.lang.String str19 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        java.lang.String str18 = serviceRequest5.getStatus();
        java.lang.String str19 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate7 = null;
        serviceRequest5.setRequestDate(localDate7);
        java.time.LocalDate localDate9 = null;
        serviceRequest5.setRequestDate(localDate9);
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getStatus();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate23 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass9 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str16 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.lang.String str22 = serviceRequest5.getStatus();
        java.time.LocalDate localDate23 = null;
        serviceRequest5.setRequestDate(localDate23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str19 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.String str18 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        java.lang.String str21 = serviceRequest5.getStatus();
        java.lang.String str22 = serviceRequest5.getStatus();
        java.lang.String str23 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate7 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        java.lang.String str19 = serviceRequest5.getStatus();
        java.lang.String str20 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str25 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str22 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str18 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate7 = null;
        serviceRequest5.setRequestDate(localDate7);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate24 = null;
        serviceRequest5.setRequestDate(localDate24);
        java.lang.Class<?> wildcardClass26 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        java.lang.String str14 = serviceRequest5.getCustomerName();
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.String str14 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str18 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str18 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate27 = null;
        serviceRequest5.setRequestDate(localDate27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str19 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        serviceRequest5.setStatus("hi!");
        java.lang.String str24 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        java.lang.String str21 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str17 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str17 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("hi!");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getCustomerName();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setIssueDescription("");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.lang.String str16 = serviceRequest5.getStatus();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass22 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.lang.String str16 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        java.lang.String str18 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        java.lang.Class<?> wildcardClass23 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        java.lang.String str23 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str25 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        java.lang.String str18 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.lang.String str16 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.lang.String str22 = serviceRequest5.getCustomerName();
        java.lang.String str23 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.lang.String str20 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str11 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = localDate12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        java.lang.String str11 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.lang.String str16 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.lang.String str18 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getContactNumber();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        java.lang.String str20 = serviceRequest5.getContactNumber();
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        java.lang.String str21 = serviceRequest5.getStatus();
        java.lang.String str22 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        java.lang.String str22 = serviceRequest5.getContactNumber();
        java.lang.String str23 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate9 = null;
        serviceRequest5.setRequestDate(localDate9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("");
        java.lang.String str16 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str16 = serviceRequest5.getStatus();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str17 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        java.lang.String str14 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setStatus("hi!");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getStatus();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("");
        java.lang.String str16 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        java.lang.String str23 = serviceRequest5.getCustomerName();
        java.lang.String str24 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str18 = serviceRequest5.getContactNumber();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str8 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.String str15 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        java.time.LocalDate localDate23 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(localDate23);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getStatus();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str19 = serviceRequest5.getStatus();
        java.lang.String str20 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str18 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str11 = serviceRequest5.getContactNumber();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "", "hi!");
        serviceRequest5.setStatus("");
        java.lang.String str8 = serviceRequest5.getContactNumber();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getStatus();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.lang.String str19 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getStatus();
        java.lang.String str20 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        java.lang.String str17 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.lang.String str11 = serviceRequest5.getContactNumber();
        java.lang.String str12 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        java.lang.String str16 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate7 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setStatus("");
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        java.lang.String str19 = serviceRequest5.getStatus();
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass24 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.lang.String str19 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        java.lang.String str16 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.lang.String str11 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str15 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.lang.String str18 = serviceRequest5.getStatus();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        java.lang.String str22 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.String str25 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate26 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass9 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setStatus("hi!");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str19 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        java.lang.String str21 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        java.lang.String str20 = serviceRequest5.getCustomerName();
        java.lang.String str21 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.lang.String str16 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str18 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str20 = serviceRequest5.getContactNumber();
        java.lang.String str21 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass23 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str19 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        serviceRequest5.setStatus("hi!");
        java.lang.String str24 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate25 = serviceRequest5.getRequestDate();
        java.lang.String str26 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(localDate25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass10 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str19 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str20 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        serviceRequest5.setIssueDescription("");
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.lang.String str22 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.lang.String str20 = serviceRequest5.getStatus();
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        java.lang.String str23 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate24 = null;
        serviceRequest5.setRequestDate(localDate24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        java.lang.String str20 = serviceRequest5.getStatus();
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.lang.String str22 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate7 = null;
        serviceRequest5.setRequestDate(localDate7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.lang.String str20 = serviceRequest5.getCustomerName();
        java.lang.String str21 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.lang.String str8 = serviceRequest5.getContactNumber();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.String str19 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        java.lang.String str19 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("");
        java.lang.String str16 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str20 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate27 = null;
        serviceRequest5.setRequestDate(localDate27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("hi!");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.lang.String str18 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        java.time.LocalDate localDate23 = null;
        serviceRequest5.setRequestDate(localDate23);
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        serviceRequest5.setStatus("");
        java.lang.String str23 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getStatus();
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        java.lang.String str16 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str26 = serviceRequest5.getCustomerName();
        java.lang.String str27 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        java.lang.String str20 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.String str22 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate7 = null;
        serviceRequest5.setRequestDate(localDate7);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.lang.String str20 = serviceRequest5.getStatus();
        java.lang.String str21 = serviceRequest5.getCustomerName();
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        java.lang.String str20 = serviceRequest5.getContactNumber();
        java.lang.String str21 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.lang.String str16 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.lang.String str18 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        java.lang.String str14 = serviceRequest5.getCustomerName();
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getStatus();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str17 = serviceRequest5.getStatus();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str20 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        java.lang.String str14 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        java.lang.String str16 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.lang.String str16 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getStatus();
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getStatus();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getStatus();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str17 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("");
        java.lang.String str20 = serviceRequest5.getStatus();
        java.lang.String str21 = serviceRequest5.getCustomerName();
        java.lang.String str22 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.lang.String str13 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }
}

