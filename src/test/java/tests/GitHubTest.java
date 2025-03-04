package tests;

import org.junit.jupiter.api.Test;
import pages.GitHubPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GitHubTest extends TestBase {
    GitHubPage gitHubPage = new GitHubPage();

    @Test
    void checkTitleOfEnterprisePage() {
        gitHubPage
                .openPage()
                .hoverSolutions()
                .clickEnterprise()
                .checkTitle();
    }
}
