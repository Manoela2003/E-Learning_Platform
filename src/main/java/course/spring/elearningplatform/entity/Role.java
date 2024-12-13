package course.spring.elearningplatform.entity;

public enum Role {

    STUDENT("ROLE_STUDENT"),
    INSTRUCTOR("ROLE_INSTRUCTOR"),
    ADMIN("ROLE_ADMIN"),
    UNREGISTERED("ROLE_UNREGISTERED");

    private Role(String description) {
        this.description = description;
    }
    private String description;

    public String getDescription() {
        return description;
    }
}
