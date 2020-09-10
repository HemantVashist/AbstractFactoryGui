public class Client {
    public static void main(String[] args) {
        GuiComponentFactory androidGuiComponentFactory = new AndroidGuiComponentFactory();
        GuiComponentFactory iosGuiComponentFactory = new IosGuiComponentFactory();

        NavButton androidNavButton = androidGuiComponentFactory.getNavButton();
        androidNavButton.render();

        AppDrawer androidAppDrawer = androidGuiComponentFactory.getAppDrawer();
        androidAppDrawer.render();
        androidAppDrawer.open();

        NotificationCenter androidNotificationCenter = androidGuiComponentFactory.getNotificationCenter();
        androidNotificationCenter.render();
        androidNotificationCenter.open();

        NavButton iosNavButton = iosGuiComponentFactory.getNavButton();
        iosNavButton.render();

        AppDrawer iosAppDrawer = iosGuiComponentFactory.getAppDrawer();
        iosAppDrawer.render();
        iosAppDrawer.open();

        NotificationCenter iosNotificationCenter = iosGuiComponentFactory.getNotificationCenter();
        iosNotificationCenter.render();
        iosNotificationCenter.open();
    }
}
