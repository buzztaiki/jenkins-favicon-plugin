package org.jenkinsci.plugins.favicon;

import hudson.Extension;
import hudson.model.PageDecorator;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.StaplerRequest;

@Extension
public final class FaviconPageDecorator extends PageDecorator {
    private String faviconPath;

    public FaviconPageDecorator() {
        super();
    }

    @Override
    public String getDisplayName() {
        return "Favicon";
    }

    @Override
    public boolean configure(StaplerRequest req, JSONObject json) throws FormException {
        faviconPath = json.getString("faviconPath");
        save();
        return super.configure(req, json);
    }

    public String getFaviconPath() {
        return faviconPath;
    }

    public boolean isUseFavicon() {
        return faviconPath != null;
    }
}
