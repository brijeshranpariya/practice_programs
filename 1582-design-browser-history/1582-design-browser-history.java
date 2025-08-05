class Node {
    String page;
    Node next;;
    Node prev;

    Node(String url) {
        page = url;
        next = null;
        prev = null;
    }
}

class BrowserHistory {
    Node currentPage;
    Node head;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        currentPage = head;
    }

    public void visit(String url) {
        currentPage.next = new Node(url);
        currentPage.next.prev = currentPage;
        currentPage = currentPage.next;
        // System.out.println("currPage: " + currentPage.page);
    }

    public String back(int steps) {
        int i = 0;
        while (currentPage != null) {
            if (currentPage.prev == null) {
                break;
            } else {
                if (i == steps) {
                    break;
                }
                i++;
                currentPage = currentPage.prev;
            }
        }
        // System.out.println("prevPage: " + currentPage.page);
        return currentPage.page;
    }

    public String forward(int steps) {
        int i = 0;
        while (currentPage != null) {
            if (currentPage.next == null) {
                break;
            } else {
                if (i == steps) {
                    break;
                }
                i++;
                currentPage = currentPage.next;
            }
        }
        // System.out.println("forward: " + currentPage.page);
        return currentPage.page;
    }

    // public static void main(String[] args) {
    //     BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
    //     browserHistory.visit("google.com");
    //     browserHistory.back(1);
    //     browserHistory.forward(1);
    // }
}

