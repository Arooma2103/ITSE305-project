import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        customerService.ServiceRequest.displayAllRequests();
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        customerService customerService0 = new customerService();
        java.lang.Class<?> wildcardClass1 = customerService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        customerService.ServiceRequest.findByCustomerName("");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        customerService.ServiceRequest.updateStatus("", "");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        customerService.ServiceRequest.findByCustomerName("hi!");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass8 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass7 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.Class<?> wildcardClass7 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass7 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        customerService.ServiceRequest.updateStatus("", "hi!");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass7 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        customerService.ServiceRequest.updateStatus("hi!", "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass7 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = localDate15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.Class<?> wildcardClass10 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "hi!", "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "", "hi!");
        java.lang.Class<?> wildcardClass6 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        customerService.ServiceRequest.updateStatus("hi!", "hi!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass10 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass8 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.lang.String str18 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass9 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str8 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass9 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass8 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setContactNumber("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "");
        java.lang.Class<?> wildcardClass6 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        java.lang.String str17 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate7 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass10 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        java.lang.String str13 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "hi!");
        serviceRequest5.setStatus("");
        java.lang.String str8 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.lang.Class<?> wildcardClass6 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass7 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "");
        java.lang.Class<?> wildcardClass6 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.Class<?> wildcardClass8 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        java.lang.String str18 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str16 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        java.lang.String str20 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setContactNumber("");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str8 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass8 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = localDate15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        java.lang.String str8 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass9 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        java.lang.String str17 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.time.LocalDate localDate9 = null;
        serviceRequest5.setRequestDate(localDate9);
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = localDate13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass8 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass7 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        java.lang.String str15 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        java.lang.String str17 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass7 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = localDate19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass8 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.lang.String str8 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        java.lang.String str17 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate7 = serviceRequest5.getRequestDate();
        java.lang.String str8 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        java.lang.String str19 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.lang.String str19 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        java.lang.String str21 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate11 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass9 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        java.lang.String str16 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        serviceRequest5.setContactNumber("");
        java.lang.Class<?> wildcardClass8 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.time.LocalDate localDate23 = null;
        serviceRequest5.setRequestDate(localDate23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        java.lang.String str8 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass10 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        java.lang.String str18 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        java.lang.String str19 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "");
        java.time.LocalDate localDate6 = serviceRequest5.getRequestDate();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("");
        java.lang.String str17 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str12 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        serviceRequest5.setIssueDescription("");
        java.lang.String str20 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass10 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        serviceRequest5.setStatus("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        java.lang.String str21 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        serviceRequest5.setContactNumber("");
        java.lang.String str21 = serviceRequest5.getStatus();
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass8 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        java.lang.String str18 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        java.lang.String str20 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.String str17 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        java.lang.String str22 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        java.lang.String str21 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass22 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.lang.String str16 = serviceRequest5.getContactNumber();
        java.lang.String str17 = serviceRequest5.getCustomerName();
        java.lang.String str18 = serviceRequest5.getStatus();
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.lang.String str19 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("hi!");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.String str16 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        java.lang.String str13 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("hi!");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.lang.String str22 = serviceRequest5.getContactNumber();
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        java.lang.String str18 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass15 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        serviceRequest5.setContactNumber("");
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str8 = serviceRequest5.getCustomerName();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        java.lang.String str19 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        java.lang.String str20 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        serviceRequest5.setContactNumber("");
        java.lang.String str21 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass22 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        java.time.LocalDate localDate22 = null;
        serviceRequest5.setRequestDate(localDate22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        java.lang.String str18 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        java.lang.String str17 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = localDate20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.time.LocalDate localDate26 = null;
        serviceRequest5.setRequestDate(localDate26);
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass30 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.lang.String str15 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str17 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        java.lang.String str21 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setContactNumber("");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setContactNumber("");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        java.lang.String str17 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.lang.String str22 = serviceRequest5.getCustomerName();
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate25 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(localDate25);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate13 = null;
        serviceRequest5.setRequestDate(localDate13);
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        serviceRequest5.setContactNumber("");
        java.lang.String str24 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str19 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        java.lang.String str19 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        java.lang.String str22 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.lang.String str18 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        java.lang.String str19 = serviceRequest5.getStatus();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.String str12 = serviceRequest5.getStatus();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str19 = serviceRequest5.getContactNumber();
        java.lang.String str20 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        serviceRequest5.setContactNumber("");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        java.lang.Class<?> wildcardClass22 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = localDate18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate22 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.String str19 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass7 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        java.lang.String str17 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setStatus("hi!");
        java.lang.String str14 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        java.lang.String str19 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str13 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        java.lang.String str16 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getStatus();
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.lang.String str16 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass23 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("");
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        java.lang.String str17 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate16 = null;
        serviceRequest5.setRequestDate(localDate16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.lang.String str15 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        serviceRequest5.setCustomerName("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass13 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.lang.Class<?> wildcardClass22 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        java.lang.String str18 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate9 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDate9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getStatus();
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setIssueDescription("");
        java.lang.String str11 = serviceRequest5.getContactNumber();
        java.lang.String str12 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate15 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        java.lang.String str21 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate12 = null;
        serviceRequest5.setRequestDate(localDate12);
        java.lang.String str14 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "hi!");
        serviceRequest5.setStatus("");
        java.lang.String str8 = serviceRequest5.getContactNumber();
        java.lang.String str9 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.lang.String str18 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        serviceRequest5.setContactNumber("");
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate14 = null;
        serviceRequest5.setRequestDate(localDate14);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.Class<?> wildcardClass19 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setContactNumber("");
        java.lang.Class<?> wildcardClass10 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        serviceRequest5.setContactNumber("hi!");
        java.lang.Class<?> wildcardClass21 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setIssueDescription("");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.lang.String str10 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("");
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.lang.Class<?> wildcardClass27 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        java.lang.String str16 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        java.lang.String str20 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass14 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "", "");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setIssueDescription("");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("");
        java.time.LocalDate localDate9 = null;
        serviceRequest5.setRequestDate(localDate9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        java.lang.String str21 = serviceRequest5.getStatus();
        java.lang.String str22 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.lang.String str18 = serviceRequest5.getStatus();
        java.lang.String str19 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.String str17 = serviceRequest5.getCustomerName();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass16 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setContactNumber("");
        serviceRequest5.setStatus("");
        serviceRequest5.setContactNumber("hi!");
        java.time.LocalDate localDate16 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        java.lang.String str20 = serviceRequest5.getCustomerName();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getCustomerName();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        serviceRequest5.setContactNumber("");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("");
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "hi!", localDate2, "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.lang.String str14 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        serviceRequest5.setIssueDescription("hi!");
        serviceRequest5.setStatus("hi!");
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.String str11 = serviceRequest5.getIssueDescription();
        java.lang.Class<?> wildcardClass12 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.lang.String str8 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.lang.String str8 = serviceRequest5.getContactNumber();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.String str9 = serviceRequest5.getContactNumber();
        java.lang.String str10 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        java.time.LocalDate localDate17 = null;
        serviceRequest5.setRequestDate(localDate17);
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getStatus();
        java.lang.String str7 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        java.lang.String str18 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        java.lang.String str10 = serviceRequest5.getStatus();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setStatus("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate15 = null;
        serviceRequest5.setRequestDate(localDate15);
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "", "hi!");
        java.time.LocalDate localDate6 = null;
        serviceRequest5.setRequestDate(localDate6);
        java.time.LocalDate localDate8 = null;
        serviceRequest5.setRequestDate(localDate8);
        serviceRequest5.setStatus("");
        java.lang.String str12 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str17 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getStatus();
        serviceRequest5.setContactNumber("");
        java.lang.String str10 = serviceRequest5.getContactNumber();
        java.lang.Class<?> wildcardClass11 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.String str20 = serviceRequest5.getCustomerName();
        java.lang.String str21 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        java.lang.String str13 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str12 = serviceRequest5.getContactNumber();
        java.time.LocalDate localDate13 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.Class<?> wildcardClass6 = serviceRequest5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        java.time.LocalDate localDate18 = null;
        serviceRequest5.setRequestDate(localDate18);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate14 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.time.LocalDate localDate19 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str9 = serviceRequest5.getCustomerName();
        java.time.LocalDate localDate10 = serviceRequest5.getRequestDate();
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate18 = serviceRequest5.getRequestDate();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass20 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        serviceRequest5.setIssueDescription("");
        java.lang.String str14 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.time.LocalDate localDate20 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getContactNumber();
        java.lang.String str7 = serviceRequest5.getStatus();
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setContactNumber("");
        java.time.LocalDate localDate11 = null;
        serviceRequest5.setRequestDate(localDate11);
        java.lang.String str13 = serviceRequest5.getCustomerName();
        java.lang.String str14 = serviceRequest5.getStatus();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate8 = serviceRequest5.getRequestDate();
        serviceRequest5.setStatus("");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setIssueDescription("");
        serviceRequest5.setStatus("hi!");
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        serviceRequest5.setIssueDescription("hi!");
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str12 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("hi!");
        java.lang.String str15 = serviceRequest5.getStatus();
        java.lang.String str16 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        serviceRequest5.setCustomerName("");
        serviceRequest5.setContactNumber("");
        serviceRequest5.setCustomerName("");
        java.time.LocalDate localDate12 = serviceRequest5.getRequestDate();
        java.lang.String str13 = serviceRequest5.getStatus();
        java.lang.String str14 = serviceRequest5.getStatus();
        java.lang.String str15 = serviceRequest5.getIssueDescription();
        java.lang.String str16 = serviceRequest5.getStatus();
        java.lang.String str17 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setStatus("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate10 = null;
        serviceRequest5.setRequestDate(localDate10);
        java.lang.String str12 = serviceRequest5.getContactNumber();
        serviceRequest5.setCustomerName("");
        serviceRequest5.setStatus("hi!");
        java.time.LocalDate localDate17 = serviceRequest5.getRequestDate();
        serviceRequest5.setCustomerName("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        serviceRequest5.setCustomerName("");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        java.lang.Class<?> wildcardClass17 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "hi!", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate7 = null;
        serviceRequest5.setRequestDate(localDate7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.Class<?> wildcardClass18 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.time.LocalDate localDate24 = null;
        serviceRequest5.setRequestDate(localDate24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getIssueDescription();
        java.lang.String str7 = serviceRequest5.getContactNumber();
        serviceRequest5.setContactNumber("hi!");
        java.lang.String str10 = serviceRequest5.getIssueDescription();
        java.lang.String str11 = serviceRequest5.getStatus();
        java.lang.String str12 = serviceRequest5.getCustomerName();
        java.lang.String str13 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("", "", localDate2, "hi!", "hi!");
        java.lang.String str6 = serviceRequest5.getCustomerName();
        java.lang.String str7 = serviceRequest5.getCustomerName();
        java.lang.String str8 = serviceRequest5.getIssueDescription();
        java.lang.String str9 = serviceRequest5.getIssueDescription();
        serviceRequest5.setContactNumber("hi!");
        serviceRequest5.setContactNumber("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        java.time.LocalDate localDate20 = null;
        serviceRequest5.setRequestDate(localDate20);
        java.lang.String str22 = serviceRequest5.getIssueDescription();
        serviceRequest5.setStatus("");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.time.LocalDate localDate19 = null;
        serviceRequest5.setRequestDate(localDate19);
        serviceRequest5.setIssueDescription("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        java.lang.String str18 = serviceRequest5.getContactNumber();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.lang.String str18 = serviceRequest5.getIssueDescription();
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.time.LocalDate localDate2 = null;
        customerService.ServiceRequest serviceRequest5 = new customerService.ServiceRequest("hi!", "", localDate2, "hi!", "");
        serviceRequest5.setCustomerName("hi!");
        java.lang.String str8 = serviceRequest5.getStatus();
        java.lang.Class<?> wildcardClass9 = serviceRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        java.lang.String str20 = serviceRequest5.getIssueDescription();
        java.time.LocalDate localDate21 = null;
        serviceRequest5.setRequestDate(localDate21);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        serviceRequest5.setContactNumber("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }
}

