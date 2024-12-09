import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getStatus();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.lang.String str22 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str12 = serviceRequest5.getStatus();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        java.lang.String str18 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        java.lang.String str22 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        java.lang.String str20 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        java.lang.String str23 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass30 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.lang.String str15 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        java.lang.String str18 = serviceRequest5.getStatus();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        java.time.LocalDate localDate26 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(localDate26);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass8 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass25 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str16 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        java.lang.String str13 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str19 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        serviceRequest5.setContactNumber("");
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.String str16 = serviceRequest5.getStatus();
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        serviceRequest5.setCustomerName("");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.String str24 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        java.lang.String str22 = serviceRequest5.getCustomerName();
        java.lang.String str23 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str21 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("hi!");
        java.lang.String str18 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate9 = null;
        serviceRequest5.setRequestDate(localDate9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getStatus();
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        java.lang.String str17 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str23 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        java.lang.String str24 = serviceRequest5.getIssueDescription();
        java.lang.String str25 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getContactNumber();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        java.lang.String str21 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate23 = null;
        serviceRequest5.setRequestDate(localDate23);
        java.lang.String str25 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.lang.String str15 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str11 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        java.lang.String str23 = serviceRequest5.getIssueDescription();
        java.lang.String str24 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate25 = null;
        serviceRequest5.setRequestDate(localDate25);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str12 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str25 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str16 = serviceRequest5.getContactNumber();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.lang.String str13 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setContactNumber("");
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        java.lang.String str11 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        java.lang.String str19 = serviceRequest5.getContactNumber();
        java.lang.String str20 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str23 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        java.lang.String str19 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str24 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.time.LocalDate localDate7 = serviceRequest5.getRequestDate();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str12 = serviceRequest5.getStatus();
        java.lang.String str13 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        java.lang.String str19 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        java.lang.String str20 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str18 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getStatus();
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str20 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.lang.String str8 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        java.lang.String str11 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.String str14 = serviceRequest5.getStatus();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str18 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str23 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        java.time.LocalDate localDate23 = serviceRequest5.getRequestDate();
        java.lang.String str24 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(localDate23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        java.lang.String str18 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str12 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        java.lang.String str17 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate24 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate24);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        java.lang.String str24 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate23 = null;
        serviceRequest5.setRequestDate(localDate23);
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getStatus();
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        java.lang.String str18 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        java.lang.String str21 = serviceRequest5.getStatus();
        java.lang.String str22 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        java.lang.String str22 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.lang.String str13 = serviceRequest5.getStatus();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate7 = serviceRequest5.getRequestDate();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate9 = null;
        serviceRequest5.setRequestDate(localDate9);
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate25 = null;
        serviceRequest5.setRequestDate(localDate25);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        java.lang.String str19 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        java.lang.String str20 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate9 = null;
        serviceRequest5.setRequestDate(localDate9);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.lang.String str16 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        java.lang.String str17 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        java.lang.String str22 = serviceRequest5.getCustomerName();
        java.lang.String str23 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        java.time.LocalDate localDate25 = null;
        serviceRequest5.setRequestDate(localDate25);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        java.lang.String str21 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str19 = serviceRequest5.getStatus();
        java.lang.String str20 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.lang.String str18 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        java.time.LocalDate localDate21 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.lang.String str18 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getStatus();
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate7 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        java.lang.String str22 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate7 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        java.lang.String str19 = serviceRequest5.getCustomerName();
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        java.lang.String str23 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        serviceRequest5.setCustomerName("");
        java.lang.String str25 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        java.lang.String str24 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate27 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(localDate27);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getStatus();
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
        serviceRequest5.setIssueDescription("");
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "");
        serviceRequest5.setStatus("");
        java.lang.String str8 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.lang.String str12 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        java.time.LocalDate localDate23 = null;
        serviceRequest5.setRequestDate(localDate23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str8 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate9 = null;
        serviceRequest5.setRequestDate(localDate9);
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        java.lang.String str21 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "", "hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str11 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        java.lang.String str19 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.lang.String str8 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass10 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        java.lang.String str21 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        java.lang.String str23 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
    }
}

