public class AndroidGuiComponentFactory extends GuiComponentFactory {
    @Override
    public NavButton getNavButton() {
        NavButton navButton = new AndroidNavButton();
        return navButton;
    }

    @Override
    public AppDrawer getAppDrawer() {
        AppDrawer appDrawer = new AndroidAppDrawer();
        return appDrawer;
    }

    @Override
    public NotificationCenter getNotificationCenter() {
        NotificationCenter notificationCenter = new AndroidNotificationCenter();
        return notificationCenter;
    }
}
