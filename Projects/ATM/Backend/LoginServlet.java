//package Projects.ATM.Backend;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.util.HashMap;
//
//@WebServlet("/LoginServlet")
//public class LoginServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest req, HttpServletResponse res)
//            throws ServletException, IOException {
//
//        // Parse JSON input
//        StringBuilder sb = new StringBuilder();
//        BufferedReader reader = req.getReader();
//        String line;
//        while ((line = reader.readLine()) != null) sb.append(line);
//
//        JSONObject json = new JSONObject(sb.toString());
//        int cn = json.getInt("customerNumber");
//        int pin = json.getInt("pin");
//
//        // Validate using your existing HashMap logic
//        HashMap<Integer, Integer> data = new HashMap<>();
//        data.put(952141, 191904);
//        data.put(98947, 71976);
//
//        JSONObject response = new JSONObject();
//        if (data.containsKey(cn) && data.get(cn) == pin) {
//            response.put("success", true);
//        } else {
//            response.put("success", false);
//            response.put("message", "Invalid credentials");
//        }
//
//        res.setContentType("application/json");
//        res.getWriter().write(response.toString());
//    }
//}
