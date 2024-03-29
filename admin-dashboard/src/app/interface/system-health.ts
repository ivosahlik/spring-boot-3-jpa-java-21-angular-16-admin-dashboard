export interface SystemHealth {
    status: string;
    components: {
      db: {
        status: string,
        details: {
          database: string,
          hello: number
        }
      },
      diskSpace: {
        status: string,
        details: {
          total: number,
          free: number | string,
          threshold: number
        }
      },
      ping: {
        status: string
      }
    };
}
