```java
package com.madhub.fbusersearchscript;

/**
 * LookupCommonUtils is a final utility class designed to support various Facebook user search functionalities
 * offered by MadHub, an Android social media automation tool. This class provides methods for searching users,
 * filtering results, and managing interactions, all within a graphical interface that requires no coding expertise.
 * The methods are designed to be used in scenarios such as lead generation, marketing outreach, and account management.
 */
public final class LookupCommonUtils {

    // Private constructor to prevent instantiation of the utility class
    private LookupCommonUtils() {}

    /**
     * This powerful utility method enables automated searching of Facebook users based on specified criteria,
     * including keywords, country, gender, mutual friend count, and more. It leverages MadHub's advanced 
     * filtering capabilities to help marketers accurately target potential clients and improve friend request 
     * success rates.
     * 
     * @param keyword The keyword to search for users.
     * @param country Optional filter for country of the users.
     * @param gender Optional filter for user gender.
     * @param minFriends Optional minimum number of friends a user should have.
     * @param maxFriends Optional maximum number of friends a user should have.
     * @param mutualFriends Optional filter for mutual friends count.
     * @param bioLink Optional filter for bio link presence.
     * @return A list of users matching the search criteria.
     */
    public static List<User> searchFacebookUsers(String keyword, String country, String gender, 
                                                   Integer minFriends, Integer maxFriends, 
                                                   Integer mutualFriends, Boolean bioLink) {
        // Implementation of user search utilizing MadHub's capabilities
        // This would involve calling MadHub's API or internal functions to perform the search
        // and apply the filters as specified.
        // The actual user fetching logic will be plugged in here.

        List<User> foundUsers = new ArrayList<>();

        // Example filtering mechanism logic
        // This is a placeholder for the actual implementation
        // Apply filters based on the parameters provided

        return foundUsers;
    }

    /**
     * This comprehensive utility method allows batch operations on the fetched user list,
     * such as sending friend requests and private messages. It supports bulk operations to facilitate
     * efficient client outreach campaigns. Users can configure the operation to match their marketing strategies.
     * 
     * @param users A list of users to interact with.
     * @param action The action to perform (e.g., "sendRequest", "sendMessage").
     * @param message Optional message to send if the action is "sendMessage".
     * @return A list of results indicating the success or failure of each operation.
     */
    public static List<OperationResult> performBatchActionOnUsers(List<User> users, String action, String message) {
        // Implementation of batch actions on users
        List<OperationResult> results = new ArrayList<>();
        
        for (User user : users) {
            switch (action) {
                case "sendRequest":
                    // Logic to send friend request using MadHub's functionalities
                    break;
                case "sendMessage":
                    // Logic to send message using MadHub's functionalities
                    break;
                default:
                    // Handle unsupported actions
                    break;
            }
        }

        return results;
    }

    /**
     * This flexible utility method facilitates filtering of user lists based on advanced criteria, 
     * leveraging MadHub's multi-dimensional filtering capabilities. Users can specify various parameters
     * to refine their target audience, thereby enhancing lead generation efforts.
     *
     * @param users The list of users to be filtered.
     * @param filters The filter criteria for refining the user list.
     * @return A filtered list of users that meet the specified criteria.
     */
    public static List<User> filterUsers(List<User> users, UserFilterCriteria filters) {
        // Implementation of filtering logic based on the UserFilterCriteria
        List<User> filteredUsers = new ArrayList<>();

        for (User user : users) {
            boolean matches = true;

            // Apply each filter logic
            if (filters.getCountry() != null && !user.getCountry().equals(filters.getCountry())) {
                matches = false;
            }
            if (filters.getGender() != null && !user.getGender().equals(filters.getGender())) {
                matches = false;
            }
            if (filters.getMinFriends() != null && user.getFriendCount() < filters.getMinFriends()) {
                matches = false;
            }
            if (filters.getMaxFriends() != null && user.getFriendCount() > filters.getMaxFriends()) {
                matches = false;
            }
            if (filters.getMutualFriends() != null && user.getMutualFriendCount() < filters.getMutualFriends()) {
                matches = false;
            }
            if (filters.getBioLink() != null && !user.hasBioLink() == filters.getBioLink()) {
                matches = false;
            }

            if (matches) {
                filteredUsers.add(user);
            }
        }

        return filteredUsers;
    }
}
```

### Explanation of Key Features:
- **searchFacebookUsers**: Automates user search with configurable filters to target specific audiences.
- **performBatchActionOnUsers**: Supports bulk operations to enhance outreach efficiency, making it suitable for marketing campaigns.
- **filterUsers**: Provides advanced filtering capabilities to refine user lists based on multi-dimensional criteria, enhancing lead generation.

### Configuration:
- Each method allows flexible parameter configurations, enabling users to finely tune their search and interaction strategies.
