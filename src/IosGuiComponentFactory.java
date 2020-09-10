public class IosGuiComponentFactory extends GuiComponentFactory {
    @Override
    public NavButton getNavButton() {
        NavButton navButton = new IosNavButton();
        return navButton;
    }

    @Override
    public AppDrawer getAppDrawer() {
        AppDrawer appDrawer = new IosAppDrawer();
        return appDrawer;
    }

    @Override
    public NotificationCenter getNotificationCenter() {
        NotificationCenter notificationCenter = new IosNotificationCenter();
        return notificationCenter;
    }
}
