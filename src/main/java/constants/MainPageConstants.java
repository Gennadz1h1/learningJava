package constants;

import java.util.List;

public class MainPageConstants {
    public int elementsInUserDropdownCount = 5;
    public int elementsInSupportDropdownCount = 4;
    public List<String> navigationTabsList = List.of(new String[]{"New Products", "Services", "API keys", "Billing plans", "Payments", "Block logs", "My orders", "My profile", "Ask a question"});
    public List<String> supportDropdownList = List.of(new String[]{"FAQ", "How to start", "ChatBot assistant", "Ask a question"});
    public List<String> userDropdownList = List.of(new String[]{"My services", "My API keys", "My payments", "My profile", "Logout"});
}
