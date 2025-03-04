package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GitHubTest extends TestBase{
    @Test
    public void testGithub() {
        String title = driver.getTitle();
        assertEquals("Build and ship software on a single, collaborative platform", title);
    }
}
